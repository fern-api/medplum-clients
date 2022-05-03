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

  Optional<List<Reference>> communicationRequest();

  Optional<List<ClaimResponse_Insurance>> insurance();

  Optional<CodeableConcept> formCode();

  Optional<Id> id();

  CodeableConcept type();

  Optional<Reference> request();

  Optional<Code> status();

  Optional<List<ClaimResponse_Item>> item();

  Optional<ClaimResponse_Payment> payment();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> created();

  Optional<CodeableConcept> subType();

  Optional<List<ClaimResponse_Adjudication>> adjudication();

  Optional<List<ClaimResponse_ProcessNote>> processNote();

  Optional<Code> outcome();

  Reference patient();

  Optional<String> disposition();

  Optional<CodeableConcept> payeeType();

  Optional<List<ClaimResponse_AddItem>> addItem();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> requestor();

  Optional<String> preAuthRef();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<CodeableConcept> fundsReserve();

  Optional<List<ClaimResponse_Error>> error();

  Optional<List<Identifier>> identifier();

  Optional<List<ClaimResponse_Total>> total();

  Optional<Uri> implicitRules();

  Optional<Code> use();

  Optional<Attachment> form();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<Period> preAuthPeriod();

  static ImmutableClaimResponse.InsurerBuildStage builder() {
    return ImmutableClaimResponse.builder();
  }
}
