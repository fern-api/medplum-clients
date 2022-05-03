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

  Optional<List<Reference>> authority();

  Optional<CodeableConcept> scope();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<List<Contract_Signer>> signer();

  Optional<Meta> meta();

  Optional<List<Reference>> relevantHistory();

  Optional<List<Reference>> subject();

  Optional<String> version();

  Optional<List<Contract_Rule>> rule();

  Optional<DateTime> issued();

  Optional<CodeableConcept> expirationType();

  Optional<List<Contract_Term>> term();

  Optional<List<Contract_Friendly>> friendly();

  Optional<List<Reference>> site();

  Optional<List<Contract_Legal>> legal();

  Optional<Id> id();

  Optional<Period> applies();

  Optional<String> subtitle();

  Optional<Attachment> legallyBindingAttachment();

  Optional<Narrative> text();

  Optional<Reference> author();

  Optional<Reference> topicReference();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Contract_ContentDefinition> contentDefinition();

  Optional<List<Reference>> domain();

  Optional<CodeableConcept> legalState();

  Optional<CodeableConcept> contentDerivative();

  Optional<List<CodeableConcept>> subType();

  Optional<Reference> instantiatesCanonical();

  Optional<List<Reference>> supportingInfo();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> instantiatesUri();

  Optional<Reference> legallyBindingReference();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<String> name();

  Optional<String> title();

  Optional<Uri> url();

  Optional<List<String>> alias();

  static ImmutableContract.ResourceTypeBuildStage builder() {
    return ImmutableContract.builder();
  }
}
