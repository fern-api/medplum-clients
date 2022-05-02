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
  Optional<Reference> requestor();

  Optional<Meta> meta();

  Optional<Attachment> form();

  Optional<Code> outcome();

  Optional<String> preAuthRef();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  CodeableConcept type();

  Reference insurer();

  Optional<Code> status();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> subType();

  Optional<CodeableConcept> formCode();

  Reference patient();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> payeeType();

  Optional<List<ClaimResponse_ProcessNote>> processNote();

  Optional<ClaimResponse_Payment> payment();

  Optional<List<Reference>> communicationRequest();

  Optional<List<ClaimResponse_Insurance>> insurance();

  Optional<Period> preAuthPeriod();

  String resourceType();

  Optional<Code> language();

  Optional<List<ClaimResponse_Adjudication>> adjudication();

  Optional<Reference> request();

  Optional<DateTime> created();

  Optional<List<ClaimResponse_Error>> error();

  Optional<Id> id();

  Optional<List<ClaimResponse_AddItem>> addItem();

  Optional<Code> use();

  Optional<List<ClaimResponse_Total>> total();

  Optional<String> disposition();

  Optional<CodeableConcept> fundsReserve();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ClaimResponse_Item>> item();

  Optional<List<Extension>> extension();

  static ImmutableClaimResponse.TypeBuildStage builder() {
    return ImmutableClaimResponse.builder();
  }
}
