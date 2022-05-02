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
  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> supportingInfo();

  Optional<Attachment> legallyBindingAttachment();

  Optional<List<Reference>> subject();

  Optional<List<Contract_Term>> term();

  Optional<String> subtitle();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<List<Contract_Rule>> rule();

  Optional<Contract_ContentDefinition> contentDefinition();

  Optional<List<ResourceList>> contained();

  Optional<Reference> author();

  Optional<Meta> meta();

  Optional<Uri> url();

  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> subType();

  Optional<Uri> instantiatesUri();

  Optional<List<Reference>> domain();

  Optional<Reference> instantiatesCanonical();

  Optional<Uri> implicitRules();

  Optional<List<Contract_Friendly>> friendly();

  String resourceType();

  Optional<Code> language();

  Optional<String> version();

  Optional<CodeableConcept> scope();

  Optional<List<Reference>> site();

  Optional<List<Contract_Legal>> legal();

  Optional<Reference> legallyBindingReference();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<CodeableConcept> legalState();

  Optional<CodeableConcept> expirationType();

  Optional<List<Reference>> authority();

  Optional<Code> status();

  Optional<CodeableConcept> contentDerivative();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> applies();

  Optional<String> name();

  Optional<Reference> topicReference();

  Optional<List<String>> alias();

  Optional<List<Reference>> relevantHistory();

  Optional<List<Contract_Signer>> signer();

  Optional<DateTime> issued();

  static ImmutableContract.ResourceTypeBuildStage builder() {
    return ImmutableContract.builder();
  }
}
