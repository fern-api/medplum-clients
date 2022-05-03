import { ErrorBody } from "./ErrorBody";
export declare type Response = SuccessResponse | ErrorResponse;
export interface SuccessResponse {
    ok: true;
    statusCode: number;
}
export interface ErrorResponse {
    ok: false;
    statusCode: number;
    error: ErrorBody;
}
