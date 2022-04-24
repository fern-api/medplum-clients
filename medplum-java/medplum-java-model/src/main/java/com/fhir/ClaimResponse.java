package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableClaimResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse {
  Optional<Reference> requestor();

  Optional<CodeableConcept> payeeType();

  Optional<Meta> meta();

  Optional<ClaimResponse_Payment> payment();

  Optional<List<ClaimResponse_Item>> item();

  Optional<String> preAuthRef();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<Period> preAuthPeriod();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<code> language();

  Optional<id> id();

  Optional<CodeableConcept> subType();

  Optional<String> disposition();

  Optional<List<ClaimResponse_Adjudication>> adjudication();

  Optional<List<ClaimResponse_ProcessNote>> processNote();

  Optional<List<ClaimResponse_AddItem>> addItem();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> fundsReserve();

  Optional<Reference> request();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ClaimResponse_Insurance>> insurance();

  Optional<List<ClaimResponse_Error>> error();

  Reference insurer();

  Optional<Attachment> form();

  Optional<dateTime> created();

  Optional<Narrative> text();

  Optional<code> status();

  Optional<CodeableConcept> formCode();

  Optional<code> outcome();

  Reference patient();

  Optional<List<ClaimResponse_Total>> total();

  Optional<code> use();

  CodeableConcept type();

  Optional<List<Reference>> communicationRequest();

  static ImmutableClaimResponse.ResourceTypeBuildStage builder() {
    return ImmutableClaimResponse.builder();
  }
}
