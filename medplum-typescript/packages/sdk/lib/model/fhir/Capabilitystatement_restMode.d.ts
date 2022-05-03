export declare type Capabilitystatement_restMode = Capabilitystatement_restMode.Client | Capabilitystatement_restMode.Server;
export declare const Capabilitystatement_restMode: {
    Client: Capabilitystatement_restMode.Client;
    Server: Capabilitystatement_restMode.Server;
    _visit: <Result>(value: Capabilitystatement_restMode, visitor: Capabilitystatement_restMode._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_restMode {
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
