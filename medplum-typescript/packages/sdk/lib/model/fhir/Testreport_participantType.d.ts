export declare type Testreport_participantType = Testreport_participantType.Client | Testreport_participantType.Server;
export declare const Testreport_participantType: {
    Client: Testreport_participantType.Client;
    Server: Testreport_participantType.Server;
    _visit: <Result>(value: Testreport_participantType, visitor: Testreport_participantType._Visitor<Result>) => Result;
};
export declare namespace Testreport_participantType {
    type Client = "client" & {
        __Client: void;
    };
    type Server = "server" & {
        __Server: void;
    };
    interface _Visitor<Result> {
        client: () => Result;
        server: () => Result;
        _unknown: () => Result;
    }
}
