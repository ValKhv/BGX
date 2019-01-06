"use strict";
import React, { Component } from "react";
import {
    StyleSheet,
    View,
    FlatList,
    TouchableOpacity,
    ImageBackground,
    Image,
    Text,
    StatusBar
} from "react-native";

import ItemProduct from '../cells/ItemProduct';
import HeaderDigitalSpot from '../components/HeaderDigitalSpot'; 
import BottomBarDigitalSpot from '../components/BottomBarDigitalSpot'; 
import * as CommonStyleSheet from '../common/StyleSheet';
import * as Constants from '../common/Constants';
import ConfigAPI from "../api/ConfigAPI";
import {BaseService} from "../api/BaseService";
import LoadingIndicator from "../components/LoadingIndicator";
import Item from "../models/Item";
import Utils from "../common/Utils";
import PopupFilter from '../components/PopupFilter';
import i18n from '../translations/i18n';

class DigitalSpot extends Component {

    constructor(props) {
        super(props);

        this.state = {
            dataSource: [],
            indexSelected: -1,
            filterCategory: i18n.t('ALL_ITEMS'),
            isActiveFilter: false,
            isActiveFavorite: false,
            listCategorySelected: "-1",
            ratingFromSelect: 0,
            ratingToSelect: 5,
            ratingPriceFrom: "0",
            ratingPriceTo: "10000",
            isFilter: false,
            progressView: false
        }

        this.account = null;
        this.isRequestData = false;
    }

    static navigationOptions = ({ navigation, screenProps }) => ({
        header: null,
        
    });

    async componentDidMount() {
        
        this.requestGetListItem();
        this.account = await Utils.getDataWithKey(Constants.KEY_USER);
    }

    onBack_event = () => {
        this.setState({ 
            indexSelected: -1,
            isActiveFilter: true,
            isActiveFavorite: false
        });

        this.requestGetWishList(this.account.magentoId);
    }

    buttonClearFilter_clicked = () => {
        this.requestGetListItem();
        
        this.setState({ 
            filterCategory: i18n.t('ALL_ITEMS'),
            listCategorySelected: "-1",
            ratingFromSelect: 0,
            ratingToSelect: 5,
            ratingPriceFrom: "0",
            ratingPriceTo: "10000",
            isFilter: false
        });
    }

    //Flat list item seleted
    onPressSelectItem = (index) => {
        let product = this.state.dataSource[index];

        this.setState({
            indexSelected: index,
            isActiveFavorite: product.isFavorite
        });
        this.forceUpdate();
    }

    onLongPressItem = (index) => {
        this.props.navigation.navigate('ProductDetailView', {item: this.state.dataSource[index], onBackEvent: this.onBack_event});
    }

    //Header
    buttonMenuHeader_clicked = () => {
        this.props.navigation.openDrawer();
    }

    buttonMyOrdersHeader_clicked = () => {
        this.props.navigation.navigate('MyOrdersView', {onBackEvent: this.onBack_event } );
    }

    buttonFavoriteHeader_clicked = () => {
        this.props.navigation.navigate('FavoritesView', {onBackEvent: this.onBack_event } );
    }

    buttonShoppingCartHeader_clicked = () => {
        this.props.navigation.navigate('ShoppingCartView', {onBackEvent: this.onBack_event } );
    }

    //Tabbar Button
    buttonFavorite_clicked = () => {
        let data = this.state.dataSource[this.state.indexSelected];
        
        if (data.isFavorite) {
            this.requestDeleteItemFavorite(data.wishListItemID);
        } else {
            this.requestAddItemToFavorite(data.id);
        }
    }

    buttonDetail_clicked = () => {
        if (this.state.indexSelected == -1) return;
        this.props.navigation.navigate('ProductDetailView', { item: this.state.dataSource[this.state.indexSelected], onBackEvent: this.onBack_event });
    }

    buttonToCart_clicked = async () => {
        this.requestAddShoppingCart(this.state.dataSource[this.state.indexSelected].id);
    }

    buttonFilter_clicked = () => {
        this.forceUpdate();
        this.popupDialog.showSlideAnimationDialog();
    }

    // Popup button
    buttonOKPoup_clicked = () => {
        this.popupDialog.dismissSlideAnimationDialog();
    }

    _onFilter = (arrayCheckBoxSelected, totalCategory, priceFrom, priceTo, starFrom, starTo) => {
        var count = 0;
        for (let item of arrayCheckBoxSelected) {
            if (item.isSelected) {
                count += 1;
            }
        }

        var categoryIDString = "";
        var listIDCateSelected = "";

        var title = i18n.t('ALL_ITEMS');
        if (count == 0) {
            title = i18n.t('NO_ITEM_SELECTED');
            categoryIDString = "0";
        } else if (count == totalCategory) {
            title = i18n.t('ALL_ITEMS');
            
            for (let item of arrayCheckBoxSelected) {
                categoryIDString += item.categoryID + ',';
            }
            categoryIDString = categoryIDString.substring(0, categoryIDString.length - 1);
            listIDCateSelected = "-1";
        } else if (count == 1 || count == 2) {
            var nameString = "";
            for (let item of arrayCheckBoxSelected) {
                if (item.isSelected) {
                    nameString += item.categoryName + ', ';
                    categoryIDString += item.categoryID + ',';
                }
            }

            title = nameString.substring(0, nameString.length - 2);
            categoryIDString = categoryIDString.substring(0, categoryIDString.length - 1);
            listIDCateSelected = categoryIDString;

        } else if (count >= 3) {
            title = i18n.t('FILTERED');

            for (let item of arrayCheckBoxSelected) {
                if (item.isSelected) {
                    categoryIDString += item.categoryID + ',';
                }
            }

            categoryIDString = categoryIDString.substring(0, categoryIDString.length - 1);
            listIDCateSelected = categoryIDString;
        }

        this.setState({ 
            filterCategory: title,
            listCategorySelected: listIDCateSelected,
            ratingFromSelect: starFrom,
            ratingToSelect: starTo,
            ratingPriceFrom: priceFrom,
            ratingPriceTo: priceTo,
            isFilter: true
        });

        this.requestFilter(categoryIDString, priceFrom, priceTo, starFrom, starTo);
    }

    //Request get data
    requestGetListItem = () => {
        let params = {
            [ConfigAPI.PARAM_METHOD]: ConfigAPI.METHOD_GET_DIGITAL_SPOT, 
            [ConfigAPI.PARAM_API_URL]: ConfigAPI.API_GET_DIGITAL_SPOT, 
        };

        this.setState({ progressView: true });
        let service = new BaseService();
        service.setCallback(this);
        service.setParam(params);
        service.requestDataPostGet(BaseService.METHOD.GET);
    }

    //Request get Rating
    requestGetRating = () => {
        var array = [];
        for (let item of this.state.dataSource) {
            array.push(item.id);
        }
        
        let string = array.toString();

        let params = {
            [ConfigAPI.PARAM_METHOD]: ConfigAPI.METHOD_LIST_RATING, 
            [ConfigAPI.PARAM_API_URL]: ConfigAPI.API_GET_LIST_RATING + string, 
        };

        // this.setState({ progressView: true });
        let service = new BaseService();
        service.setCallback(this);
        service.setParam(params);
        service.requestDataPostGet(BaseService.METHOD.GET);
    }

    requestGetWishList = (customerID) => {
        let params = {
            [ConfigAPI.PARAM_METHOD]: ConfigAPI.METHOD_GET_WISH_LIST, 
            [ConfigAPI.PARAM_API_URL]: ConfigAPI.API_GET_WISH_LIST.replace('{customer_id}', customerID)
        };
  
        this.setState({ progressView: true });
        let service = new BaseService();
        service.setCallback(this);
        service.setParam(params);
        service.requestDataPostGet(BaseService.METHOD.GET);
    }

    requestAddItemToFavorite = (productID) => {
        if (this.isRequestData) {
            return;
        }

        this.isRequestData = false;

        let params = {
            [ConfigAPI.PARAM_METHOD]: ConfigAPI.METHOD_ADD_TO_WISH_LIST, 
            [ConfigAPI.PARAM_API_URL]: ConfigAPI.API_ADD_TO_WISH_LIST + productID,
            [ConfigAPI.PARAM_CUSTOMER_ID]: this.account.magentoId
        };

        let service = new BaseService();
        service.setCallback(this);
        service.setParam(params);
        service.requestDataPostGet(BaseService.METHOD.POST);
    }

    requestDeleteItemFavorite = (wishListItemID) => {
        if (this.isRequestData) {
            return;
        }

        this.isRequestData = false;

        let params = {
            [ConfigAPI.PARAM_METHOD]: ConfigAPI.METHOD_DELETE_ITEM_FAVORITE, 
            [ConfigAPI.PARAM_API_URL]: ConfigAPI.API_DELTE_ITEM_WISH_LIST.replace('{wishlist_item_id}', wishListItemID).replace('{customer_id}', this.account.magentoId)
        };

        this.setState({ progressView: true });
        let service = new BaseService();
        service.setCallback(this);
        service.setParam(params);
        service.requestDataPostGet(BaseService.METHOD.DELTE);
    }
    
    requestFilter = (categoryIDString, priceFrom, priceTo, starFrom, starTo) => {
        let star = starFrom + ',' + starTo;
        let params = {
            [ConfigAPI.PARAM_METHOD]: ConfigAPI.METHOD_FILTER, 
            [ConfigAPI.PARAM_API_URL]: ConfigAPI.API_FILTER.replace('{category_list}', categoryIDString).replace('{rating}', star).replace('{price_from}', priceFrom).replace('{price_to}', priceTo)
        };

        this.setState({ progressView: true });
        let service = new BaseService();
        service.setCallback(this);
        service.setParam(params);
        service.requestDataPostGet(BaseService.METHOD.GET);
    }

    requestAddShoppingCart = (productID) => {
        if (this.isRequestData) {
            return;
        }

        this.isRequestData = true;

        this.setState({ progressView: true });
        let params = {
            [ConfigAPI.PARAM_METHOD]: ConfigAPI.METHOD_ADD_ITEM_SHOPPING_CART,
            [ConfigAPI.PARAM_LOCALE]: i18n.locale,
            [ConfigAPI.PARAM_USER_ID]: this.account.id,
            [ConfigAPI.PARAM_PRODUCT_ID]: productID,
        };
        let login = new BaseService();
        login.setParam(params);
        login.setCallback(this);
        login.requestData();
    }

    async onSuccess(code, message, data, method) {

        if (method === ConfigAPI.METHOD_GET_DIGITAL_SPOT) {
            var array = [];

            if (data.items == null) {
                return;
            }

            for (let item of data.items) {
                let itemParse = new Item(item, Item.ITEM_PRODUCT_TYPE.DIGITAL_SPOT);
                array.push(itemParse);
            }

            let ativeFilter = array.length > 0 ? true : false;
        
            this.setState({ 
                dataSource: [],
            });

            this.setState({ 
                dataSource: array,
                isActiveFilter: ativeFilter
            });

            this.requestGetRating();
        } else if (method === ConfigAPI.METHOD_LIST_RATING) {
            
            let count = data.length;
            for (var i = 0; i < count; i++) {
                this.state.dataSource[i].rating = data[i].value;
            }

            this.setState({ 
                dataSource: this.state.dataSource
            });

            this.requestGetWishList(this.account.magentoId);
        } else if (method === ConfigAPI.METHOD_GET_WISH_LIST) {
            let countDataSource = this.state.dataSource.length;
            
            for (var i = 0; i < countDataSource; i++) {
                this.state.dataSource[i].isFavorite = false;
                this.state.dataSource[i].wishListItemID = "";
            }

            if (data != null) {
                let countFavorite = data.length;
                let countDataSource = this.state.dataSource.length;

                for (var i = 0; i < countFavorite; i++) {
                    for (var j = 0; j < countDataSource; j++) {
                        if (data[i].product_id == this.state.dataSource[j].id) {
                            this.state.dataSource[j].isFavorite = true;
                            this.state.dataSource[j].wishListItemID = data[i].wishlist_item_id;
                            continue;
                        }
                    }
                }
            }

            this.setState({ 
                progressView: false,
                dataSource: this.state.dataSource
            });

            if (this.state.indexSelected != -1) {
                let product = this.state.dataSource[this.state.indexSelected];

                this.setState({
                    isActiveFavorite: product.isFavorite
                });
                this.forceUpdate();
            }

        } else if (method === ConfigAPI.METHOD_ADD_TO_WISH_LIST) {
            this.isRequestData = false;

            this.setState({ 
                progressView: false,
                isActiveFavorite: true
            });

            Utils.showAlert(i18n.t('MESSAGE_ADD_TO_WISHLIST'), true, null);

            if (data != null) {
                let countFavorite = data.length;
                let countDataSource = this.state.dataSource.length;

                for (var i = 0; i < countFavorite; i++) {
                    for (var j = 0; j < countDataSource; j++) {
                        if (data[i].product_id == this.state.dataSource[j].id) {
                            this.state.dataSource[j].isFavorite = true;
                            this.state.dataSource[j].wishListItemID = data[i].wishlist_item_id;
                            continue;
                        }
                    }
                }
            }
        } else if (method === ConfigAPI.METHOD_DELETE_ITEM_FAVORITE) {
            this.isRequestData = false;
            this.setState({ 
                progressView: false,
                isActiveFavorite: false
            });

            Utils.showAlert(i18n.t('MESSAGE_REMOVE_FROM_FAVORITE'), true, null);
            this.state.dataSource[this.state.indexSelected].isFavorite = false;
        } else if (method === ConfigAPI.METHOD_FILTER) {

            if (data == null || data.items == null) {
                return;
            }

            var array = [];
            for (let item of data.items) {
                let parseItem = new Item(item, Item.ITEM_PRODUCT_TYPE.DIGITAL_SPOT);
                array.push(parseItem);
            }

            this.setState({ 
                dataSource: []
            });

            this.setState({ 
                progressView: false,
                isActiveFavorite: false,
                dataSource: array
            });

            this.requestGetRating();
        } else if (method === ConfigAPI.METHOD_ADD_ITEM_SHOPPING_CART) {
            this.isRequestData = false;

            this.setState({ 
                progressView: false
            });
            Utils.showAlert(i18n.t('MESSAGE_ITEM_ADD_TO_SHOPPING_CART'), true, null);
        }
    }

    async onFail(code, message, method) {
        alert(message)
        this.isRequestData = false;
        this.setState({ progressView: false });
    }

    formatData = (data, numColumns) => {
        let numberOfFullRows = Math.floor(data.length / numColumns);
      
        let numberOfElementsLastRow = data.length - (numberOfFullRows * numColumns);
        
        while (numberOfElementsLastRow !== numColumns && numberOfElementsLastRow !== 0) {
          data.push({ key: `blank-${numberOfElementsLastRow}`, empty: true });
          numberOfElementsLastRow++;
        }
      
        return data;
    };

    _renderFilterButton = () => {
        if (this.state.isFilter) {
            return (
                <TouchableOpacity onPress={this.buttonClearFilter_clicked}>
                            <View style={[styles.viewRightButton, {borderColor: CommonStyleSheet.THEME_DARCK ? '#898989' : '#d0d0d0'}]}>
                                <Image style={styles.iconClose} source={CommonStyleSheet.THEME_DARCK ? require("../resource/icon_clear_white.png") : require("../resource/icon_clear_black.png")}/>
                                <Text style={{color: CommonStyleSheet.THEME_DARCK ? '#ebebeb' : '#111111'}}>{i18n.t('CLEAR_FILTER')}</Text>
                            </View>
                        </TouchableOpacity>
            );
        }

        return null;
    }

    _renderContent = () => {
        if (this.state.dataSource.length == 0) {
            return (
                <View style={[styles.flatList, {alignItems: 'center', justifyContent: 'center'}]}>
                    <Text style={[styles.emptyText, {color: CommonStyleSheet.THEME_DARCK ? '#7d7d7d' : '#959595'}]}>{i18n.t('WELLET_NO_ITEMS')}</Text>
                </View>
            );
        } else {
            return (
                <FlatList
                style={styles.flatList}
                data={this.formatData(this.state.dataSource, 2)}
                extraData={this.state}
                keyExtractor={(item, index) => index.toString()}
                numColumns={2}
                renderItem={({ item, index }) => (
                    <ItemProduct itemIndex={index} 
                                itemData={item}
                                indexSelected={this.state.indexSelected}
                                onPressSelectItem={this.onPressSelectItem}
                                onLongPressItem={this.onLongPressItem}/>
                )}
                refreshing={this.state.refreshing}
                onRefresh={this.handleRefresh}
            />
            );
        }
    }

    render() {
        StatusBar.setBarStyle('light-content', true);
        return (
            <View style={[styles.containView, {backgroundColor: CommonStyleSheet.THEME_DARCK ? '#181818' : 'white'}]}>
                <HeaderDigitalSpot
                    headerTitle={i18n.t('DIGITAL_SPOT')}
                    buttonMenuHeader_clicked={this.buttonMenuHeader_clicked}
                    buttonMyOrdersHeader_clicked={this.buttonMyOrdersHeader_clicked}
                    buttonFavoriteHeader_clicked={this.buttonFavoriteHeader_clicked}
                    buttonShoppingCartHeader_clicked={this.buttonShoppingCartHeader_clicked}/>

                    <View style={styles.viewButton}>
                        <TouchableOpacity disabled={true}>
                            <View style={[styles.viewLeftButton, {borderColor: CommonStyleSheet.THEME_DARCK ? '#898989' : '#d0d0d0'}]}>
                                <Text style={{color: CommonStyleSheet.THEME_DARCK ? '#ebebeb' : '#111111'}}>{this.state.filterCategory}</Text>
                            </View>
                        </TouchableOpacity>
                        {this._renderFilterButton()}
                        
                    </View>

                    {this._renderContent()}
                    <BottomBarDigitalSpot
                        isActive={this.state.indexSelected != -1 ? true : false}
                        isActiveFilter={this.state.isActiveFilter}
                        buttonFavorite_clicked={this.buttonFavorite_clicked}
                        buttonDetail_clicked={this.buttonDetail_clicked}
                        buttonToCart_clicked={this.buttonToCart_clicked}
                        buttonFilter_clicked={this.buttonFilter_clicked}
                        buttonMyOrders_clicked={this.buttonMyOrders_clicked}
                        isFavorite={this.state.isActiveFavorite}/>

                    <PopupFilter
                        ref={(popupDialog) => { this.popupDialog = popupDialog; }}
                        listCategorySelected={this.state.listCategorySelected}   
                        priceFrom={this.state.ratingPriceFrom}
                        priceTo={this.state.ratingPriceTo}
                        ratingFrom={this.state.ratingFromSelect}
                        ratingTo={this.state.ratingToSelect}
                        onFilter={this._onFilter}              
                    />

                    {/* load progress */}
                    {this.state.progressView ? <LoadingIndicator style={styles.progress_view} /> : null}
            </View>
        );
    }
}

const styles = StyleSheet.create({
    containView: {
        flex: 1
    },
    viewButton: {
        flexDirection: 'row', 
        justifyContent: 'space-between', 
        marginTop: 12
    },
    viewLeftButton: {
        borderWidth: 1.5, 
        borderRadius: 2, 
        padding: 4, 
        marginLeft: 15
    },
    viewRightButton: {
        borderWidth: 1.5, 
        borderRadius: 2, 
        padding: 4, 
        marginRight: 15, 
        flexDirection: 'row', 
        justifyContent: 'center'
    },
    iconClose: {
        width: 17, 
        height: 17, 
        marginRight: 3,
    },
    separator: {
        marginLeft: 10,
        marginRight: 10,
        height: 1,
        backgroundColor: '#e8e8e8'
    },
    flatList: {
        marginTop: 10, 
        flex: 1,
        marginBottom: 10,
        paddingRight: 15
    },
    emptyText: {
        fontSize: 18,
        fontWeight: '400',
        textAlign: 'center'
    }
});

export default DigitalSpot;