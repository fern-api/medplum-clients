package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Reference insurer();

  Optional<String> disposition();

  String resourceType();

  Optional<Code> status();

  Optional<List<ClaimResponse_Item>> item();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Attachment> form();

  Optional<List<ClaimResponse_ProcessNote>> processNote();

  Optional<List<ClaimResponse_AddItem>> addItem();

  Optional<List<ClaimResponse_Error>> error();

  Optional<CodeableConcept> subType();

  Optional<Code> outcome();

  Optional<Meta> meta();

  Optional<CodeableConcept> payeeType();

  Optional<CodeableConcept> fundsReserve();

  Optional<Narrative> text();

  CodeableConcept type();

  Reference patient();

  Optional<Reference> requestor();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Period> preAuthPeriod();

  Optional<List<Reference>> communicationRequest();

  Optional<List<ClaimResponse_Total>> total();

  Optional<CodeableConcept> formCode();

  Optional<List<Extension>> extension();

  Optional<DateTime> created();

  Optional<Reference> request();

  Optional<List<ClaimResponse_Insurance>> insurance();

  Optional<String> preAuthRef();

  Optional<Uri> implicitRules();

  Optional<Code> use();

  Optional<ClaimResponse_Payment> payment();

  Optional<Code> language();

  Optional<List<ClaimResponse_Adjudication>> adjudication();

  static ImmutableClaimResponse.InsurerBuildStage builder() {
    return ImmutableClaimResponse.builder();
  }
}
