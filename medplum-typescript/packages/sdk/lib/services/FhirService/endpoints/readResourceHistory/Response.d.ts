import * as model from "../../../../model";
import { ErrorBody } from "./ErrorBody";
export declare type Response = SuccessResponse | ErrorResponse;
export interface SuccessResponse {
    ok: true;
    statusCode: number;
    body: model.Bundle;
}
export interface ErrorResponse {
    ok: false;
    statusCode: number;
    error: ErrorBody;
}
