import React, { Component } from 'react';
import { TouchableOpacity, Image, StyleSheet, Text, ActivityIndicator, View, FlatList } from 'react-native';
import Utils from '../common/Utils';
import PopupDialog, { DialogTitle, DialogButton, SlideAnimation, ScaleAnimation, FadeAnimation, } from 'react-native-popup-dialog';
import BorderButton from './BorderButton';
import * as CommonStyleSheet from '../common/StyleSheet';
import HTML from 'react-native-render-html';
import i18n from '../translations/i18n';

const slideAnimation = new SlideAnimation({ slideFrom: 'bottom' });

export default class PopupMessage extends Component {

    constructor(props) {
        super(props);
        this.borderColor = props.borderColor;
        this.style = props.style;
        this.titleStyle = props.titleStyle;
        this.onPress = props.onPress;
        this.onPressCancel = props.onPressCancel;
        this.isConfirm = props.isConfirm;
        this.titleButtonRight = props.titleButtonRight;
        this.titleButtonLeft = props.titleButtonLeft;
        this.typeMenu = props.typeMenu != null ? true : false;
        this.state = {
            title: props.title
        }
    }

    componentDidMount() {
    }

    showSlideAnimationDialog = (message) => {
        this.setState({ title: message });
        this.slideAnimationDialog.show();
    }

    dismissSlideAnimationDialog = () => {
        this.slideAnimationDialog.dismiss();
    }

    render() {
        return (
            <PopupDialog
                dialogStyle={[styles.background_dialog, { marginLeft: this.typeMenu ? -40 : 0 }]}
                width={this.typeMenu ? (Utils.appSize().width > 400 ? 310 : (Utils.appSize().width * 0.9) - 40) : Utils.appSize().width - 50}
                height={Utils.appSize().height}
                ref={(popupDialog) => { this.slideAnimationDialog = popupDialog; }}
                dialogAnimation={slideAnimation}>

                <View style={[styles.dialogContentView, { backgroundColor: CommonStyleSheet.THEME_DARCK ? '#1c1c1c' : 'white', marginLeft: Utils.appSize().width > 400 ? 0 : 20, marginRight: Utils.appSize().width > 400 ? 0 : 20 }]}>
                    {/* <Text style={styles.title}>{this.title}</Text> */}
                    <HTML
                        containerStyle={styles.title}
                        html={this.state.title}
                        baseFontStyle={{
                            fontSize: 16,
                            margin: 20, color: CommonStyleSheet.THEME_DARCK ? 'white' : 'black',
                        }} />
                    <View style={styles.view_content_button}>
                        {
                            this.isConfirm ?
                                /* cancel button */
                                <BorderButton
                                    title={this.titleButtonLeft}
                                    onPress={this._buttonCancel}
                                    titleStyle={{ color: CommonStyleSheet.THEME_DARCK ? 'white' : 'black' }}
                                    style={[styles.button_cancel]}
                                    imageStyle={[CommonStyleSheet.viewCommonStyles.common_button_dialog,]}
                                    background={CommonStyleSheet.THEME_DARCK ? require("../resource/icon_button_dialog_drack_opacity.png") : require("../resource/icon_button_dialog_grey.png")}
                                /> : null
                        }

                        {/* export button */}
                        <BorderButton
                            title={this.titleButtonRight}
                            onPress={this._buttonDelete}
                            titleStyle={{ color: CommonStyleSheet.THEME_DARCK ? 'black' : 'white' }}
                            style={[styles.button_export]}
                            imageStyle={[CommonStyleSheet.viewCommonStyles.common_button_dialog]}
                            background={CommonStyleSheet.THEME_DARCK ? require("../resource/icon_button_dialog_white.png") : require("../resource/icon_button_dialog_drack.png")}
                        />
                    </View>
                </View>
            </PopupDialog>
        )
    }


    _buttonCancel = () => {
        this.setState({ inputType: "" });
        this.dismissSlideAnimationDialog();
        if (this.onPressCancel != null) {
            this.onPressCancel();
        }
    }

    _buttonDelete = () => {
        this.dismissSlideAnimationDialog();
        this.onPress();
    }
}

let appSize = Utils.appSize();
const styles = StyleSheet.create({
    container: {
        alignItems: 'center',
        justifyContent: 'center',
    },
    title: {
        margin: 20,
        marginBottom: 5
    },
    title1: {
        fontSize: 16,
        margin: 20,
    },
    background_dialog: {
        backgroundColor: 'transparent',
        justifyContent: 'center'
    },
    dialogContentView: {
        flexDirection: 'column',
        borderRadius: 20,
    },
    text: {
        color: '#6f6f6f',
        fontSize: 16,
        textAlign: 'center',
        width: '100%'
    },
    content: {
        margin: 20
    },
    // checkBoxStyle: {
    //     paddingTop: 10,
    //     paddingBottom: 10,
    //     width: appSize.width - 50,
    //     alignItems: 'center',
    //     justifyContent: 'center',
    // },
    text_checkbox: {
        color: 'white',
        fontSize: 20
    },
    separator: {
        height: 1,
        backgroundColor: '#2a2a2a'
    },
    button_cancel: {
        margin: 10,
        flex: 1
    },
    button_export: {
        margin: 10,
        flex: 1
    },
    view_content_button: {
        flexDirection: 'row',
        marginTop: 10,
        marginBottom: 10,
    },
    right_text_style: {
        color: 'white',
        fontSize: 20,
    },
    content_checkbox: {
        flexDirection: 'column',
    },
    label: {
        color: '#595959',
        fontSize: CommonStyleSheet.fontSize,
    },
    input: {
        marginTop: 10,
        marginLeft: 35,
    },
    select_file: {
        textDecorationLine: 'underline',
        color: '#595959',
        fontSize: CommonStyleSheet.fontSize,
        marginLeft: 35,
        marginTop: 10,
    },
    image_barcode: {
        height: 60,
        width: 60,
    }

});