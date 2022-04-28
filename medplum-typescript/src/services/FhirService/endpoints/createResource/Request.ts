import * as model from "../../../../model";

export interface Request {
    resourceType: string;
    body: model.ResourceList;
}
