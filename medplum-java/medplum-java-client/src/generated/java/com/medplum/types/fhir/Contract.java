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
  Optional<Reference> author();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<Contract_ContentDefinition> contentDefinition();

  Optional<List<Contract_Term>> term();

  Optional<CodeableConcept> contentDerivative();

  Optional<Reference> topicReference();

  Optional<CodeableConcept> legalState();

  Optional<List<Contract_Friendly>> friendly();

  Optional<Attachment> legallyBindingAttachment();

  Optional<CodeableConcept> scope();

  Optional<String> version();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> supportingInfo();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> subType();

  Optional<String> name();

  Optional<List<ResourceList>> contained();

  Optional<String> title();

  Optional<Code> language();

  Optional<List<Reference>> authority();

  Optional<List<Reference>> site();

  Optional<String> subtitle();

  Optional<List<Contract_Signer>> signer();

  String resourceType();

  Optional<DateTime> issued();

  Optional<Uri> instantiatesUri();

  Optional<CodeableConcept> type();

  Optional<Uri> url();

  Optional<Meta> meta();

  Optional<List<Contract_Rule>> rule();

  Optional<List<Reference>> domain();

  Optional<Reference> legallyBindingReference();

  Optional<Code> status();

  Optional<List<Contract_Legal>> legal();

  Optional<Narrative> text();

  Optional<List<Reference>> subject();

  Optional<Id> id();

  Optional<CodeableConcept> expirationType();

  Optional<Period> applies();

  Optional<List<String>> alias();

  Optional<List<Reference>> relevantHistory();

  Optional<Reference> instantiatesCanonical();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableContract.ResourceTypeBuildStage builder() {
    return ImmutableContract.builder();
  }
}
