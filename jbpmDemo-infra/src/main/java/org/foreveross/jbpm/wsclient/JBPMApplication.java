
package org.foreveross.jbpm.wsclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "JBPMApplication", targetNamespace = "http://application.jbpm.foreveross.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface JBPMApplication {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.foreveross.jbpm.wsclient.HistoryLogVo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryHistoryLog", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryHistoryLog")
    @ResponseWrapper(localName = "queryHistoryLogResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryHistoryLogResponse")
    public List<HistoryLogVo> queryHistoryLog(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.foreveross.jbpm.wsclient.ProcessInstanceVO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryAllActiveProcess", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryAllActiveProcess")
    @ResponseWrapper(localName = "queryAllActiveProcessResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryAllActiveProcessResponse")
    public List<ProcessInstanceVO> queryAllActiveProcess(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeProcessInstance", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.RemoveProcessInstance")
    @ResponseWrapper(localName = "removeProcessInstanceResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.RemoveProcessInstanceResponse")
    public void removeProcessInstance(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "assignToNode", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.AssignToNode")
    @ResponseWrapper(localName = "assignToNodeResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.AssignToNodeResponse")
    public void assignToNode(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "delegate", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.Delegate")
    @ResponseWrapper(localName = "delegateResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.DelegateResponse")
    public void delegate(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "repairTask", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.RepairTask")
    @ResponseWrapper(localName = "repairTaskResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.RepairTaskResponse")
    public void repairTask(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.foreveross.jbpm.wsclient.JbpmNode>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProcessNodes", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.GetProcessNodes")
    @ResponseWrapper(localName = "getProcessNodesResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.GetProcessNodesResponse")
    public List<JbpmNode> getProcessNodes(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "completeTask", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.CompleteTask")
    @ResponseWrapper(localName = "completeTaskResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.CompleteTaskResponse")
    public boolean completeTask(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @return
     *     returns java.util.List<org.foreveross.jbpm.wsclient.ProcessVO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProcesses", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.GetProcesses")
    @ResponseWrapper(localName = "getProcessesResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.GetProcessesResponse")
    public List<ProcessVO> getProcesses();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.foreveross.jbpm.wsclient.ProcessInstanceVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProcessInstance", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.GetProcessInstance")
    @ResponseWrapper(localName = "getProcessInstanceResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.GetProcessInstanceResponse")
    public ProcessInstanceVO getProcessInstance(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.foreveross.jbpm.wsclient.TaskVO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryErrorList", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryErrorList")
    @ResponseWrapper(localName = "queryErrorListResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryErrorListResponse")
    public List<TaskVO> queryErrorList();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.foreveross.jbpm.wsclient.TaskVO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryDoenTask", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryDoenTask")
    @ResponseWrapper(localName = "queryDoenTaskResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryDoenTaskResponse")
    public List<TaskVO> queryDoenTask(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.foreveross.jbpm.wsclient.TaskVO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryTodoList", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryTodoList")
    @ResponseWrapper(localName = "queryTodoListResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.QueryTodoListResponse")
    public List<TaskVO> queryTodoList(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPorcessImageStream", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.GetPorcessImageStream")
    @ResponseWrapper(localName = "getPorcessImageStreamResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.GetPorcessImageStreamResponse")
    public byte[] getPorcessImageStream(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "startProcess", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.StartProcess")
    @ResponseWrapper(localName = "startProcessResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.StartProcessResponse")
    public long startProcess(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addProcess", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.AddProcess")
    @ResponseWrapper(localName = "addProcessResponse", targetNamespace = "http://application.jbpm.foreveross.org/", className = "org.foreveross.jbpm.wsclient.AddProcessResponse")
    public void addProcess(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        byte[] arg3);

}
