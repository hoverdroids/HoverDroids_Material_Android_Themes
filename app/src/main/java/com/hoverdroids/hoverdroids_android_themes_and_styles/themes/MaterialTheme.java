package com.hoverdroids.hoverdroids_android_themes_and_styles.themes;

import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;

import com.hoverdroids.hoverdroids_android_themes_and_styles.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Material theme object to be used to display and set themes.
 *
 * @author Steven Byle
 */
public class MaterialTheme implements Serializable {

    // App themes
    public static final MaterialTheme THEME_AMBER =
            new MaterialTheme(R.string.material_theme_amber, R.style.AppTheme_Amber);
    public static final MaterialTheme THEME_BLACK =
            new MaterialTheme(R.string.material_theme_black, R.style.AppTheme_Black);
    public static final MaterialTheme THEME_BLUE =
            new MaterialTheme(R.string.material_theme_blue, R.style.AppTheme_Blue);
    public static final MaterialTheme THEME_BLUEGRAY =
            new MaterialTheme(R.string.material_theme_bluegray, R.style.AppTheme_BlueGray);
    public static final MaterialTheme THEME_BROWN =
            new MaterialTheme(R.string.material_theme_brown, R.style.AppTheme_Brown);
    public static final MaterialTheme THEME_CYAN =
            new MaterialTheme(R.string.material_theme_cyan, R.style.AppTheme_Cyan);
    public static final MaterialTheme THEME_DEEP_ORANGE =
            new MaterialTheme(R.string.material_theme_deep_orange, R.style.AppTheme_Deep_Orange);
    public static final MaterialTheme THEME_DEEP_PURPLE =
            new MaterialTheme(R.string.material_theme_deep_purple, R.style.AppTheme_Deep_Purple);
    public static final MaterialTheme THEME_GRAY =
            new MaterialTheme(R.string.material_theme_gray, R.style.AppTheme_Gray);
    public static final MaterialTheme THEME_GREEN =
            new MaterialTheme(R.string.material_theme_green, R.style.AppTheme_Green);
    public static final MaterialTheme THEME_INDIGO =
            new MaterialTheme(R.string.material_theme_indigo, R.style.AppTheme_Indigo);
    public static final MaterialTheme THEME_LIGHT_BLUE =
            new MaterialTheme(R.string.material_theme_light_blue, R.style.AppTheme_Light_Blue);
    public static final MaterialTheme THEME_LIGHT_GREEN =
            new MaterialTheme(R.string.material_theme_light_green, R.style.AppTheme_Light_Green);
    public static final MaterialTheme THEME_LIME =
            new MaterialTheme(R.string.material_theme_lime, R.style.AppTheme_Lime);
    public static final MaterialTheme THEME_ORANGE =
            new MaterialTheme(R.string.material_theme_orange, R.style.AppTheme_Orange);
    public static final MaterialTheme THEME_PINK =
            new MaterialTheme(R.string.material_theme_pink, R.style.AppTheme_Pink);
    public static final MaterialTheme THEME_PURPLE =
            new MaterialTheme(R.string.material_theme_purple, R.style.AppTheme_Purple);
    public static final MaterialTheme THEME_RED =
            new MaterialTheme(R.string.material_theme_red, R.style.AppTheme_Red);
    public static final MaterialTheme THEME_TEAL =
            new MaterialTheme(R.string.material_theme_teal, R.style.AppTheme_Teal);
    public static final MaterialTheme THEME_YELLOW =
            new MaterialTheme(R.string.material_theme_yellow, R.style.AppTheme_Yellow);


    // Dialog themes
    public static final MaterialTheme THEME_DIALOG_AMBER =
            new MaterialTheme(R.string.material_theme_amber, R.style.AppTheme_Dialog_Amber);
    public static final MaterialTheme THEME_DIALOG_BLACK =
            new MaterialTheme(R.string.material_theme_black, R.style.AppTheme_Dialog_Black);
    public static final MaterialTheme THEME_DIALOG_BLUE =
            new MaterialTheme(R.string.material_theme_blue, R.style.AppTheme_Dialog_Blue);
    public static final MaterialTheme THEME_DIALOG_BLUEGRAY =
            new MaterialTheme(R.string.material_theme_bluegray, R.style.AppTheme_Dialog_BlueGray);
    public static final MaterialTheme THEME_DIALOG_BROWN =
            new MaterialTheme(R.string.material_theme_brown, R.style.AppTheme_Dialog_Brown);
    public static final MaterialTheme THEME_DIALOG_CYAN =
            new MaterialTheme(R.string.material_theme_cyan, R.style.AppTheme_Dialog_Cyan);
    public static final MaterialTheme THEME_DIALOG_DEEP_ORANGE =
            new MaterialTheme(R.string.material_theme_deep_orange, R.style.AppTheme_Dialog_Deep_Orange);
    public static final MaterialTheme THEME_DIALOG_DEEP_PURPLE =
            new MaterialTheme(R.string.material_theme_deep_purple, R.style.AppTheme_Dialog_Deep_Purple);
    public static final MaterialTheme THEME_DIALOG_GRAY =
            new MaterialTheme(R.string.material_theme_gray, R.style.AppTheme_Dialog_Gray);
    public static final MaterialTheme THEME_DIALOG_GREEN =
            new MaterialTheme(R.string.material_theme_green, R.style.AppTheme_Dialog_Green);
    public static final MaterialTheme THEME_DIALOG_INDIGO =
            new MaterialTheme(R.string.material_theme_indigo, R.style.AppTheme_Dialog_Indigo);
    public static final MaterialTheme THEME_DIALOG_LIGHT_BLUE =
            new MaterialTheme(R.string.material_theme_light_blue, R.style.AppTheme_Dialog_Light_Blue);
    public static final MaterialTheme THEME_DIALOG_LIGHT_GREEN =
            new MaterialTheme(R.string.material_theme_light_green, R.style.AppTheme_Dialog_Light_Green);
    public static final MaterialTheme THEME_DIALOG_LIME =
            new MaterialTheme(R.string.material_theme_lime, R.style.AppTheme_Dialog_Lime);
    public static final MaterialTheme THEME_DIALOG_ORANGE =
            new MaterialTheme(R.string.material_theme_orange, R.style.AppTheme_Dialog_Orange);
    public static final MaterialTheme THEME_DIALOG_PINK =
            new MaterialTheme(R.string.material_theme_pink, R.style.AppTheme_Dialog_Pink);
    public static final MaterialTheme THEME_DIALOG_PURPLE =
            new MaterialTheme(R.string.material_theme_purple, R.style.AppTheme_Dialog_Purple);
    public static final MaterialTheme THEME_DIALOG_RED =
            new MaterialTheme(R.string.material_theme_red, R.style.AppTheme_Dialog_Red);
    public static final MaterialTheme THEME_DIALOG_TEAL =
            new MaterialTheme(R.string.material_theme_teal, R.style.AppTheme_Dialog_Teal);
    public static final MaterialTheme THEME_DIALOG_YELLOW =
            new MaterialTheme(R.string.material_theme_yellow, R.style.AppTheme_Dialog_Yellow);


    // Alert dialog themes

    public static final MaterialTheme THEME_ALERT_DIALOG_AMBER =
            new MaterialTheme(R.string.material_theme_amber, R.style.AppTheme_Dialog_Alert_Amber);
    public static final MaterialTheme THEME_ALERT_DIALOG_BLACK =
            new MaterialTheme(R.string.material_theme_black, R.style.AppTheme_Dialog_Alert_Black);
    public static final MaterialTheme THEME_ALERT_DIALOG_BLUE =
            new MaterialTheme(R.string.material_theme_blue, R.style.AppTheme_Dialog_Alert_Blue);
    public static final MaterialTheme THEME_ALERT_DIALOG_BLUEGRAY =
            new MaterialTheme(R.string.material_theme_bluegray, R.style.AppTheme_Dialog_Alert_BlueGray);
    public static final MaterialTheme THEME_ALERT_DIALOG_BROWN =
            new MaterialTheme(R.string.material_theme_brown, R.style.AppTheme_Dialog_Alert_Brown);
    public static final MaterialTheme THEME_ALERT_DIALOG_CYAN =
            new MaterialTheme(R.string.material_theme_cyan, R.style.AppTheme_Dialog_Alert_Cyan);
    public static final MaterialTheme THEME_ALERT_DIALOG_DEEP_ORANGE =
            new MaterialTheme(R.string.material_theme_deep_orange, R.style.AppTheme_Dialog_Alert_Deep_Orange);
    public static final MaterialTheme THEME_ALERT_DIALOG_DEEP_PURPLE =
            new MaterialTheme(R.string.material_theme_deep_purple, R.style.AppTheme_Dialog_Alert_Deep_Purple);
    public static final MaterialTheme THEME_ALERT_DIALOG_GRAY =
            new MaterialTheme(R.string.material_theme_gray, R.style.AppTheme_Dialog_Alert_Gray);
    public static final MaterialTheme THEME_ALERT_DIALOG_GREEN =
            new MaterialTheme(R.string.material_theme_green, R.style.AppTheme_Dialog_Alert_Green);
    public static final MaterialTheme THEME_ALERT_DIALOG_INDIGO =
            new MaterialTheme(R.string.material_theme_indigo, R.style.AppTheme_Dialog_Alert_Indigo);
    public static final MaterialTheme THEME_ALERT_DIALOG_LIGHT_BLUE =
            new MaterialTheme(R.string.material_theme_light_blue, R.style.AppTheme_Dialog_Alert_Light_Blue);
    public static final MaterialTheme THEME_ALERT_DIALOG_LIGHT_GREEN =
            new MaterialTheme(R.string.material_theme_light_green, R.style.AppTheme_Dialog_Alert_Light_Green);
    public static final MaterialTheme THEME_ALERT_DIALOG_LIME =
            new MaterialTheme(R.string.material_theme_lime, R.style.AppTheme_Dialog_Alert_Lime);
    public static final MaterialTheme THEME_ALERT_DIALOG_ORANGE =
            new MaterialTheme(R.string.material_theme_orange, R.style.AppTheme_Dialog_Alert_Orange);
    public static final MaterialTheme THEME_ALERT_DIALOG_PINK =
            new MaterialTheme(R.string.material_theme_pink, R.style.AppTheme_Dialog_Alert_Pink);
    public static final MaterialTheme THEME_ALERT_DIALOG_PURPLE =
            new MaterialTheme(R.string.material_theme_purple, R.style.AppTheme_Dialog_Alert_Purple);
    public static final MaterialTheme THEME_ALERT_DIALOG_RED =
            new MaterialTheme(R.string.material_theme_red, R.style.AppTheme_Dialog_Alert_Red);
    public static final MaterialTheme THEME_ALERT_DIALOG_TEAL =
            new MaterialTheme(R.string.material_theme_teal, R.style.AppTheme_Dialog_Alert_Teal);
    public static final MaterialTheme THEME_ALERT_DIALOG_YELLOW =
            new MaterialTheme(R.string.material_theme_yellow, R.style.AppTheme_Dialog_Alert_Yellow);

    private static List<MaterialTheme> sThemeList;
    private static List<MaterialTheme> sDialogThemeList;
    private static List<MaterialTheme> sAlertDialogThemeList;

    @StringRes
    private int nameResId;
    @StyleRes
    private int themeResId;

    public MaterialTheme(@StringRes int nameResId, @StyleRes int themeResId) {
        this.nameResId = nameResId;
        this.themeResId = themeResId;
    }

    public static List<MaterialTheme> getThemeList() {
        if (sThemeList == null) {
            sThemeList = new ArrayList<MaterialTheme>();
            sThemeList.add(THEME_AMBER);
            sThemeList.add(THEME_BLACK);
            sThemeList.add(THEME_BLUE);
            sThemeList.add(THEME_BLUEGRAY);
            sThemeList.add(THEME_BROWN);
            sThemeList.add(THEME_CYAN);
            sThemeList.add(THEME_DEEP_ORANGE);
            sThemeList.add(THEME_DEEP_PURPLE);
            sThemeList.add(THEME_GRAY);
            sThemeList.add(THEME_GREEN);
            sThemeList.add(THEME_INDIGO);
            sThemeList.add(THEME_LIGHT_BLUE);
            sThemeList.add(THEME_LIGHT_GREEN);
            sThemeList.add(THEME_LIME);
            sThemeList.add(THEME_ORANGE);
            sThemeList.add(THEME_PINK);
            sThemeList.add(THEME_PURPLE);
            sThemeList.add(THEME_RED);
            sThemeList.add(THEME_TEAL);
            sThemeList.add(THEME_YELLOW);
        }
        return sThemeList;
    }

    public static List<MaterialTheme> getDialogThemeList() {
        if (sDialogThemeList == null) {
            sDialogThemeList = new ArrayList<MaterialTheme>();
            sDialogThemeList.add(THEME_DIALOG_AMBER);
            sDialogThemeList.add(THEME_DIALOG_BLACK);
            sDialogThemeList.add(THEME_DIALOG_BLUE);
            sDialogThemeList.add(THEME_DIALOG_BLUEGRAY);
            sDialogThemeList.add(THEME_DIALOG_BROWN);
            sDialogThemeList.add(THEME_DIALOG_CYAN);
            sDialogThemeList.add(THEME_DIALOG_DEEP_ORANGE);
            sDialogThemeList.add(THEME_DIALOG_DEEP_PURPLE);
            sDialogThemeList.add(THEME_DIALOG_GRAY);
            sDialogThemeList.add(THEME_DIALOG_GREEN);
            sDialogThemeList.add(THEME_DIALOG_INDIGO);
            sDialogThemeList.add(THEME_DIALOG_LIGHT_BLUE);
            sDialogThemeList.add(THEME_DIALOG_LIGHT_GREEN);
            sDialogThemeList.add(THEME_DIALOG_LIME);
            sDialogThemeList.add(THEME_DIALOG_ORANGE);
            sDialogThemeList.add(THEME_DIALOG_PINK);
            sDialogThemeList.add(THEME_DIALOG_PURPLE);
            sDialogThemeList.add(THEME_DIALOG_RED);
            sDialogThemeList.add(THEME_DIALOG_TEAL);
            sDialogThemeList.add(THEME_DIALOG_YELLOW);
        }
        return sDialogThemeList;
    }

    public static List<MaterialTheme> getAlertDialogThemeList() {
        if (sAlertDialogThemeList == null) {
            sAlertDialogThemeList = new ArrayList<MaterialTheme>();
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_AMBER);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_BLACK);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_BLUE);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_BLUEGRAY);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_BROWN);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_CYAN);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_DEEP_ORANGE);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_DEEP_PURPLE);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_GRAY);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_GREEN);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_INDIGO);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_LIGHT_BLUE);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_LIGHT_GREEN);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_LIME);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_ORANGE);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_PINK);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_PURPLE);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_RED);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_TEAL);
            sAlertDialogThemeList.add(THEME_ALERT_DIALOG_YELLOW);
        }
        return sAlertDialogThemeList;
    }

    public int getNameResId() {
        return nameResId;
    }

    public int getThemeResId() {
        return themeResId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MaterialTheme that = (MaterialTheme) o;

        if (nameResId != that.nameResId) {
            return false;
        }
        return themeResId == that.themeResId;
    }

    @Override
    public int hashCode() {
        int result = nameResId;
        result = 31 * result + themeResId;
        return result;
    }

}
