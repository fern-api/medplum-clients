import * as model from "../../../../model";
export interface Request {
    resourceType: string;
    id: string;
    body: model.ResourceList;
}
