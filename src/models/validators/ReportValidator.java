package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTile(r.getTitle());
        if (!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _varidateContent(r.getContent());
        if (!content_error.equals("")) {
            errors.add(content_error);
        }

        return null;

    }

    private static String _validateTile(String title) {
        if (title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }
        return "";
    }

    private static String _varidateContent(String content) {
        if (content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }


}
