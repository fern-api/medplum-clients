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
    as = ImmutableContract.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract {
  Optional<Code> status();

  Optional<String> title();

  Optional<CodeableConcept> scope();

  Optional<List<Contract_Rule>> rule();

  Optional<List<Reference>> subject();

  Optional<CodeableConcept> contentDerivative();

  Optional<Reference> topicReference();

  Optional<CodeableConcept> type();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> relevantHistory();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<Uri> url();

  Optional<Id> id();

  Optional<String> name();

  Optional<List<CodeableConcept>> subType();

  Optional<List<Reference>> supportingInfo();

  Optional<Reference> legallyBindingReference();

  Optional<List<Contract_Term>> term();

  Optional<Meta> meta();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<Contract_ContentDefinition> contentDefinition();

  Optional<List<Contract_Legal>> legal();

  Optional<List<Reference>> domain();

  Optional<CodeableConcept> expirationType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Contract_Signer>> signer();

  Optional<Uri> instantiatesUri();

  Optional<String> subtitle();

  Optional<Reference> instantiatesCanonical();

  Optional<List<Reference>> authority();

  Optional<List<String>> alias();

  Optional<String> version();

  Optional<Reference> author();

  Optional<Attachment> legallyBindingAttachment();

  Optional<Narrative> text();

  Optional<DateTime> issued();

  Optional<List<Contract_Friendly>> friendly();

  Optional<List<Reference>> site();

  Optional<CodeableConcept> legalState();

  Optional<Period> applies();

  static ImmutableContract.ResourceTypeBuildStage builder() {
    return ImmutableContract.builder();
  }
}
