export type Testreport_participantType =
    | Testreport_participantType.Client
    | Testreport_participantType.Server;

export const Testreport_participantType = {
    Client: "client" as Testreport_participantType.Client,
    Server: "server" as Testreport_participantType.Server,

    _visit: <Result>(
        value: Testreport_participantType,
        visitor: Testreport_participantType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Testreport_participantType.Client:
                return visitor.client();
            case Testreport_participantType.Server:
                return visitor.server();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Testreport_participantType {
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
