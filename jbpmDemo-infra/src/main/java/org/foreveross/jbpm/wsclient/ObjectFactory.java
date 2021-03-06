
package org.foreveross.jbpm.wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.foreveross.jbpm.wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryHistoryLog_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryHistoryLog");
    private final static QName _DelegateResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "delegateResponse");
    private final static QName _CompleteTask_QNAME = new QName("http://application.jbpm.foreveross.org/", "completeTask");
    private final static QName _AssignToNode_QNAME = new QName("http://application.jbpm.foreveross.org/", "assignToNode");
    private final static QName _RemoveProcessInstance_QNAME = new QName("http://application.jbpm.foreveross.org/", "removeProcessInstance");
    private final static QName _QueryTodoList_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryTodoList");
    private final static QName _QueryErrorListResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryErrorListResponse");
    private final static QName _StartProcessResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "startProcessResponse");
    private final static QName _GetPorcessImageStreamResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "getPorcessImageStreamResponse");
    private final static QName _GetProcessInstanceResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "getProcessInstanceResponse");
    private final static QName _GetPorcessImageStream_QNAME = new QName("http://application.jbpm.foreveross.org/", "getPorcessImageStream");
    private final static QName _QueryHistoryLogResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryHistoryLogResponse");
    private final static QName _Delegate_QNAME = new QName("http://application.jbpm.foreveross.org/", "delegate");
    private final static QName _RepairTask_QNAME = new QName("http://application.jbpm.foreveross.org/", "repairTask");
    private final static QName _GetProcessInstance_QNAME = new QName("http://application.jbpm.foreveross.org/", "getProcessInstance");
    private final static QName _RepairTaskResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "repairTaskResponse");
    private final static QName _QueryDoenTaskResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryDoenTaskResponse");
    private final static QName _GetProcessesResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "getProcessesResponse");
    private final static QName _AssignToNodeResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "assignToNodeResponse");
    private final static QName _QueryErrorList_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryErrorList");
    private final static QName _GetProcesses_QNAME = new QName("http://application.jbpm.foreveross.org/", "getProcesses");
    private final static QName _GetProcessNodes_QNAME = new QName("http://application.jbpm.foreveross.org/", "getProcessNodes");
    private final static QName _CompleteTaskResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "completeTaskResponse");
    private final static QName _RemoveProcessInstanceResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "removeProcessInstanceResponse");
    private final static QName _QueryTodoListResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryTodoListResponse");
    private final static QName _StartProcess_QNAME = new QName("http://application.jbpm.foreveross.org/", "startProcess");
    private final static QName _QueryAllActiveProcessResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryAllActiveProcessResponse");
    private final static QName _QueryDoenTask_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryDoenTask");
    private final static QName _GetProcessNodesResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "getProcessNodesResponse");
    private final static QName _AddProcessResponse_QNAME = new QName("http://application.jbpm.foreveross.org/", "addProcessResponse");
    private final static QName _QueryAllActiveProcess_QNAME = new QName("http://application.jbpm.foreveross.org/", "queryAllActiveProcess");
    private final static QName _AddProcess_QNAME = new QName("http://application.jbpm.foreveross.org/", "addProcess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.foreveross.jbpm.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProcessNodesResponse }
     * 
     */
    public GetProcessNodesResponse createGetProcessNodesResponse() {
        return new GetProcessNodesResponse();
    }

    /**
     * Create an instance of {@link TaskVO }
     * 
     */
    public TaskVO createTaskVO() {
        return new TaskVO();
    }

    /**
     * Create an instance of {@link GetProcessesResponse }
     * 
     */
    public GetProcessesResponse createGetProcessesResponse() {
        return new GetProcessesResponse();
    }

    /**
     * Create an instance of {@link RemoveProcessInstanceResponse }
     * 
     */
    public RemoveProcessInstanceResponse createRemoveProcessInstanceResponse() {
        return new RemoveProcessInstanceResponse();
    }

    /**
     * Create an instance of {@link CompleteTaskResponse }
     * 
     */
    public CompleteTaskResponse createCompleteTaskResponse() {
        return new CompleteTaskResponse();
    }

    /**
     * Create an instance of {@link QueryErrorListResponse }
     * 
     */
    public QueryErrorListResponse createQueryErrorListResponse() {
        return new QueryErrorListResponse();
    }

    /**
     * Create an instance of {@link QueryHistoryLog }
     * 
     */
    public QueryHistoryLog createQueryHistoryLog() {
        return new QueryHistoryLog();
    }

    /**
     * Create an instance of {@link QueryAllActiveProcessResponse }
     * 
     */
    public QueryAllActiveProcessResponse createQueryAllActiveProcessResponse() {
        return new QueryAllActiveProcessResponse();
    }

    /**
     * Create an instance of {@link QueryHistoryLogResponse }
     * 
     */
    public QueryHistoryLogResponse createQueryHistoryLogResponse() {
        return new QueryHistoryLogResponse();
    }

    /**
     * Create an instance of {@link GetProcessInstanceResponse }
     * 
     */
    public GetProcessInstanceResponse createGetProcessInstanceResponse() {
        return new GetProcessInstanceResponse();
    }

    /**
     * Create an instance of {@link DelegateResponse }
     * 
     */
    public DelegateResponse createDelegateResponse() {
        return new DelegateResponse();
    }

    /**
     * Create an instance of {@link CompleteTask }
     * 
     */
    public CompleteTask createCompleteTask() {
        return new CompleteTask();
    }

    /**
     * Create an instance of {@link AddProcess }
     * 
     */
    public AddProcess createAddProcess() {
        return new AddProcess();
    }

    /**
     * Create an instance of {@link RepairTask }
     * 
     */
    public RepairTask createRepairTask() {
        return new RepairTask();
    }

    /**
     * Create an instance of {@link StartProcess }
     * 
     */
    public StartProcess createStartProcess() {
        return new StartProcess();
    }

    /**
     * Create an instance of {@link GetPorcessImageStream }
     * 
     */
    public GetPorcessImageStream createGetPorcessImageStream() {
        return new GetPorcessImageStream();
    }

    /**
     * Create an instance of {@link ProcessInstanceVO }
     * 
     */
    public ProcessInstanceVO createProcessInstanceVO() {
        return new ProcessInstanceVO();
    }

    /**
     * Create an instance of {@link StartProcessResponse }
     * 
     */
    public StartProcessResponse createStartProcessResponse() {
        return new StartProcessResponse();
    }

    /**
     * Create an instance of {@link QueryTodoListResponse }
     * 
     */
    public QueryTodoListResponse createQueryTodoListResponse() {
        return new QueryTodoListResponse();
    }

    /**
     * Create an instance of {@link GetProcessInstance }
     * 
     */
    public GetProcessInstance createGetProcessInstance() {
        return new GetProcessInstance();
    }

    /**
     * Create an instance of {@link AssignToNodeResponse }
     * 
     */
    public AssignToNodeResponse createAssignToNodeResponse() {
        return new AssignToNodeResponse();
    }

    /**
     * Create an instance of {@link GetPorcessImageStreamResponse }
     * 
     */
    public GetPorcessImageStreamResponse createGetPorcessImageStreamResponse() {
        return new GetPorcessImageStreamResponse();
    }

    /**
     * Create an instance of {@link RepairTaskResponse }
     * 
     */
    public RepairTaskResponse createRepairTaskResponse() {
        return new RepairTaskResponse();
    }

    /**
     * Create an instance of {@link RemoveProcessInstance }
     * 
     */
    public RemoveProcessInstance createRemoveProcessInstance() {
        return new RemoveProcessInstance();
    }

    /**
     * Create an instance of {@link QueryAllActiveProcess }
     * 
     */
    public QueryAllActiveProcess createQueryAllActiveProcess() {
        return new QueryAllActiveProcess();
    }

    /**
     * Create an instance of {@link Delegate }
     * 
     */
    public Delegate createDelegate() {
        return new Delegate();
    }

    /**
     * Create an instance of {@link GetProcesses }
     * 
     */
    public GetProcesses createGetProcesses() {
        return new GetProcesses();
    }

    /**
     * Create an instance of {@link HistoryLogVo }
     * 
     */
    public HistoryLogVo createHistoryLogVo() {
        return new HistoryLogVo();
    }

    /**
     * Create an instance of {@link GetProcessNodes }
     * 
     */
    public GetProcessNodes createGetProcessNodes() {
        return new GetProcessNodes();
    }

    /**
     * Create an instance of {@link QueryErrorList }
     * 
     */
    public QueryErrorList createQueryErrorList() {
        return new QueryErrorList();
    }

    /**
     * Create an instance of {@link AssignToNode }
     * 
     */
    public AssignToNode createAssignToNode() {
        return new AssignToNode();
    }

    /**
     * Create an instance of {@link ProcessVO }
     * 
     */
    public ProcessVO createProcessVO() {
        return new ProcessVO();
    }

    /**
     * Create an instance of {@link QueryDoenTaskResponse }
     * 
     */
    public QueryDoenTaskResponse createQueryDoenTaskResponse() {
        return new QueryDoenTaskResponse();
    }

    /**
     * Create an instance of {@link QueryDoenTask }
     * 
     */
    public QueryDoenTask createQueryDoenTask() {
        return new QueryDoenTask();
    }

    /**
     * Create an instance of {@link JbpmNode }
     * 
     */
    public JbpmNode createJbpmNode() {
        return new JbpmNode();
    }

    /**
     * Create an instance of {@link QueryTodoList }
     * 
     */
    public QueryTodoList createQueryTodoList() {
        return new QueryTodoList();
    }

    /**
     * Create an instance of {@link AddProcessResponse }
     * 
     */
    public AddProcessResponse createAddProcessResponse() {
        return new AddProcessResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryHistoryLog")
    public JAXBElement<QueryHistoryLog> createQueryHistoryLog(QueryHistoryLog value) {
        return new JAXBElement<QueryHistoryLog>(_QueryHistoryLog_QNAME, QueryHistoryLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "delegateResponse")
    public JAXBElement<DelegateResponse> createDelegateResponse(DelegateResponse value) {
        return new JAXBElement<DelegateResponse>(_DelegateResponse_QNAME, DelegateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "completeTask")
    public JAXBElement<CompleteTask> createCompleteTask(CompleteTask value) {
        return new JAXBElement<CompleteTask>(_CompleteTask_QNAME, CompleteTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignToNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "assignToNode")
    public JAXBElement<AssignToNode> createAssignToNode(AssignToNode value) {
        return new JAXBElement<AssignToNode>(_AssignToNode_QNAME, AssignToNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProcessInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "removeProcessInstance")
    public JAXBElement<RemoveProcessInstance> createRemoveProcessInstance(RemoveProcessInstance value) {
        return new JAXBElement<RemoveProcessInstance>(_RemoveProcessInstance_QNAME, RemoveProcessInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTodoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryTodoList")
    public JAXBElement<QueryTodoList> createQueryTodoList(QueryTodoList value) {
        return new JAXBElement<QueryTodoList>(_QueryTodoList_QNAME, QueryTodoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryErrorListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryErrorListResponse")
    public JAXBElement<QueryErrorListResponse> createQueryErrorListResponse(QueryErrorListResponse value) {
        return new JAXBElement<QueryErrorListResponse>(_QueryErrorListResponse_QNAME, QueryErrorListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "startProcessResponse")
    public JAXBElement<StartProcessResponse> createStartProcessResponse(StartProcessResponse value) {
        return new JAXBElement<StartProcessResponse>(_StartProcessResponse_QNAME, StartProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPorcessImageStreamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "getPorcessImageStreamResponse")
    public JAXBElement<GetPorcessImageStreamResponse> createGetPorcessImageStreamResponse(GetPorcessImageStreamResponse value) {
        return new JAXBElement<GetPorcessImageStreamResponse>(_GetPorcessImageStreamResponse_QNAME, GetPorcessImageStreamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcessInstanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "getProcessInstanceResponse")
    public JAXBElement<GetProcessInstanceResponse> createGetProcessInstanceResponse(GetProcessInstanceResponse value) {
        return new JAXBElement<GetProcessInstanceResponse>(_GetProcessInstanceResponse_QNAME, GetProcessInstanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPorcessImageStream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "getPorcessImageStream")
    public JAXBElement<GetPorcessImageStream> createGetPorcessImageStream(GetPorcessImageStream value) {
        return new JAXBElement<GetPorcessImageStream>(_GetPorcessImageStream_QNAME, GetPorcessImageStream.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryHistoryLogResponse")
    public JAXBElement<QueryHistoryLogResponse> createQueryHistoryLogResponse(QueryHistoryLogResponse value) {
        return new JAXBElement<QueryHistoryLogResponse>(_QueryHistoryLogResponse_QNAME, QueryHistoryLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delegate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "delegate")
    public JAXBElement<Delegate> createDelegate(Delegate value) {
        return new JAXBElement<Delegate>(_Delegate_QNAME, Delegate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepairTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "repairTask")
    public JAXBElement<RepairTask> createRepairTask(RepairTask value) {
        return new JAXBElement<RepairTask>(_RepairTask_QNAME, RepairTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcessInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "getProcessInstance")
    public JAXBElement<GetProcessInstance> createGetProcessInstance(GetProcessInstance value) {
        return new JAXBElement<GetProcessInstance>(_GetProcessInstance_QNAME, GetProcessInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepairTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "repairTaskResponse")
    public JAXBElement<RepairTaskResponse> createRepairTaskResponse(RepairTaskResponse value) {
        return new JAXBElement<RepairTaskResponse>(_RepairTaskResponse_QNAME, RepairTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoenTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryDoenTaskResponse")
    public JAXBElement<QueryDoenTaskResponse> createQueryDoenTaskResponse(QueryDoenTaskResponse value) {
        return new JAXBElement<QueryDoenTaskResponse>(_QueryDoenTaskResponse_QNAME, QueryDoenTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcessesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "getProcessesResponse")
    public JAXBElement<GetProcessesResponse> createGetProcessesResponse(GetProcessesResponse value) {
        return new JAXBElement<GetProcessesResponse>(_GetProcessesResponse_QNAME, GetProcessesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignToNodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "assignToNodeResponse")
    public JAXBElement<AssignToNodeResponse> createAssignToNodeResponse(AssignToNodeResponse value) {
        return new JAXBElement<AssignToNodeResponse>(_AssignToNodeResponse_QNAME, AssignToNodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryErrorList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryErrorList")
    public JAXBElement<QueryErrorList> createQueryErrorList(QueryErrorList value) {
        return new JAXBElement<QueryErrorList>(_QueryErrorList_QNAME, QueryErrorList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcesses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "getProcesses")
    public JAXBElement<GetProcesses> createGetProcesses(GetProcesses value) {
        return new JAXBElement<GetProcesses>(_GetProcesses_QNAME, GetProcesses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcessNodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "getProcessNodes")
    public JAXBElement<GetProcessNodes> createGetProcessNodes(GetProcessNodes value) {
        return new JAXBElement<GetProcessNodes>(_GetProcessNodes_QNAME, GetProcessNodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "completeTaskResponse")
    public JAXBElement<CompleteTaskResponse> createCompleteTaskResponse(CompleteTaskResponse value) {
        return new JAXBElement<CompleteTaskResponse>(_CompleteTaskResponse_QNAME, CompleteTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProcessInstanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "removeProcessInstanceResponse")
    public JAXBElement<RemoveProcessInstanceResponse> createRemoveProcessInstanceResponse(RemoveProcessInstanceResponse value) {
        return new JAXBElement<RemoveProcessInstanceResponse>(_RemoveProcessInstanceResponse_QNAME, RemoveProcessInstanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTodoListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryTodoListResponse")
    public JAXBElement<QueryTodoListResponse> createQueryTodoListResponse(QueryTodoListResponse value) {
        return new JAXBElement<QueryTodoListResponse>(_QueryTodoListResponse_QNAME, QueryTodoListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "startProcess")
    public JAXBElement<StartProcess> createStartProcess(StartProcess value) {
        return new JAXBElement<StartProcess>(_StartProcess_QNAME, StartProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAllActiveProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryAllActiveProcessResponse")
    public JAXBElement<QueryAllActiveProcessResponse> createQueryAllActiveProcessResponse(QueryAllActiveProcessResponse value) {
        return new JAXBElement<QueryAllActiveProcessResponse>(_QueryAllActiveProcessResponse_QNAME, QueryAllActiveProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoenTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryDoenTask")
    public JAXBElement<QueryDoenTask> createQueryDoenTask(QueryDoenTask value) {
        return new JAXBElement<QueryDoenTask>(_QueryDoenTask_QNAME, QueryDoenTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcessNodesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "getProcessNodesResponse")
    public JAXBElement<GetProcessNodesResponse> createGetProcessNodesResponse(GetProcessNodesResponse value) {
        return new JAXBElement<GetProcessNodesResponse>(_GetProcessNodesResponse_QNAME, GetProcessNodesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "addProcessResponse")
    public JAXBElement<AddProcessResponse> createAddProcessResponse(AddProcessResponse value) {
        return new JAXBElement<AddProcessResponse>(_AddProcessResponse_QNAME, AddProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAllActiveProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "queryAllActiveProcess")
    public JAXBElement<QueryAllActiveProcess> createQueryAllActiveProcess(QueryAllActiveProcess value) {
        return new JAXBElement<QueryAllActiveProcess>(_QueryAllActiveProcess_QNAME, QueryAllActiveProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://application.jbpm.foreveross.org/", name = "addProcess")
    public JAXBElement<AddProcess> createAddProcess(AddProcess value) {
        return new JAXBElement<AddProcess>(_AddProcess_QNAME, AddProcess.class, null, value);
    }

}
