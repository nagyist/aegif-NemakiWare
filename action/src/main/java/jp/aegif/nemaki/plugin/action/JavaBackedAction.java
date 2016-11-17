package jp.aegif.nemaki.plugin.action;


import java.util.List;
import java.util.Map;

import org.apache.chemistry.opencmis.commons.data.ObjectData;
import org.springframework.plugin.core.Plugin;

import jp.aegif.nemaki.plugin.action.trigger.ActionTriggerBase;


public interface JavaBackedAction extends Plugin<String>{

	public String getActionTiTle();

	public String getActionDiscription();

	public ActionTriggerBase getActionTrigger();

	public boolean canExecute(ObjectData obj);

	public String executeAction(ObjectData obj, String json);




}
