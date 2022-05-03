export declare type MessagedefinitionResponserequired = MessagedefinitionResponserequired.Always | MessagedefinitionResponserequired.Never;
export declare const MessagedefinitionResponserequired: {
    Always: MessagedefinitionResponserequired.Always;
    Never: MessagedefinitionResponserequired.Never;
    _visit: <Result>(value: MessagedefinitionResponserequired, visitor: MessagedefinitionResponserequired._Visitor<Result>) => Result;
};
export declare namespace MessagedefinitionResponserequired {
    type Always = "always" & {
        __Always: void;
    };
    type Never = "never" & {
        __Never: void;
    };
    interface _Visitor<Result> {
        always: () => Result;
        never: () => Result;
        _unknown: () => Result;
    }
}
