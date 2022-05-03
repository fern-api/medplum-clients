export declare type Plandefinition_actionRequiredbehavior = Plandefinition_actionRequiredbehavior.Must | Plandefinition_actionRequiredbehavior.Could;
export declare const Plandefinition_actionRequiredbehavior: {
    Must: Plandefinition_actionRequiredbehavior.Must;
    Could: Plandefinition_actionRequiredbehavior.Could;
    _visit: <Result>(value: Plandefinition_actionRequiredbehavior, visitor: Plandefinition_actionRequiredbehavior._Visitor<Result>) => Result;
};
export declare namespace Plandefinition_actionRequiredbehavior {
    type Must = "must" & {
        __Must: void;
    };
    type Could = "could" & {
        __Could: void;
    };
    interface _Visitor<Result> {
        must: () => Result;
        could: () => Result;
        _unknown: () => Result;
    }
}
