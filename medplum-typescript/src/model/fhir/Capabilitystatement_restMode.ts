export type Capabilitystatement_restMode =
    | Capabilitystatement_restMode.Client
    | Capabilitystatement_restMode.Server;

export const Capabilitystatement_restMode = {
    Client: "client" as Capabilitystatement_restMode.Client,
    Server: "server" as Capabilitystatement_restMode.Server,

    _visit: <Result>(
        value: Capabilitystatement_restMode,
        visitor: Capabilitystatement_restMode._Visitor<Result>
    ): Result => {
        switch (value) {
            case Capabilitystatement_restMode.Client:
                return visitor.client();
            case Capabilitystatement_restMode.Server:
                return visitor.server();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_restMode {
    export type Client = "client" & {
        __Client: void;
    };
    export type Server = "server" & {
        __Server: void;
    };

    export interface _Visitor<Result> {
        client: () => Result;
        server: () => Result;
        _unknown: () => Result;
    }
}
