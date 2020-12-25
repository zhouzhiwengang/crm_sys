package com.zzg.util.converter;

import java.beans.PropertyEditorSupport;


public class DateEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(DateUtils.formatDateStr(text));
	}
}
