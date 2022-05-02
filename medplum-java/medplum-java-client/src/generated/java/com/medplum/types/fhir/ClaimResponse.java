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
  Optional<Meta> meta();

  Optional<List<ClaimResponse_Total>> total();

  Optional<Code> use();

  Optional<Reference> requestor();

  Optional<String> preAuthRef();

  Optional<Id> id();

  Optional<ClaimResponse_Payment> payment();

  Optional<CodeableConcept> fundsReserve();

  Reference insurer();

  Optional<Attachment> form();

  CodeableConcept type();

  Optional<Period> preAuthPeriod();

  Optional<CodeableConcept> subType();

  Optional<Code> language();

  Optional<List<ClaimResponse_Item>> item();

  Optional<String> disposition();

  Reference patient();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> formCode();

  Optional<Code> outcome();

  Optional<List<ClaimResponse_Adjudication>> adjudication();

  Optional<Reference> request();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Code> status();

  Optional<List<Reference>> communicationRequest();

  Optional<List<ClaimResponse_ProcessNote>> processNote();

  Optional<DateTime> created();

  Optional<CodeableConcept> payeeType();

  Optional<List<ClaimResponse_AddItem>> addItem();

  Optional<Uri> implicitRules();

  Optional<List<ClaimResponse_Insurance>> insurance();

  Optional<List<ResourceList>> contained();

  Optional<List<ClaimResponse_Error>> error();

  static ImmutableClaimResponse.InsurerBuildStage builder() {
    return ImmutableClaimResponse.builder();
  }
}
