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
    as = ImmutableContract.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract {
  Optional<CodeableConcept> scope();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<String> title();

  Optional<String> name();

  Optional<List<Contract_Rule>> rule();

  Optional<List<Contract_Signer>> signer();

  Optional<List<Contract_Friendly>> friendly();

  Optional<List<Reference>> authority();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<CodeableConcept> expirationType();

  Optional<Reference> instantiatesCanonical();

  Optional<CodeableConcept> type();

  Optional<Narrative> text();

  Optional<Attachment> legallyBindingAttachment();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> subType();

  Optional<Period> applies();

  Optional<List<Reference>> domain();

  Optional<String> version();

  Optional<List<Reference>> site();

  Optional<CodeableConcept> legalState();

  Optional<Reference> legallyBindingReference();

  Optional<uri> implicitRules();

  Optional<String> subtitle();

  Optional<Meta> meta();

  Optional<Reference> topicReference();

  Optional<id> id();

  Optional<List<Extension>> extension();

  Optional<List<Contract_Term>> term();

  Optional<List<Reference>> supportingInfo();

  Optional<List<Reference>> relevantHistory();

  Optional<List<ResourceList>> contained();

  Optional<List<Contract_Legal>> legal();

  Optional<Contract_ContentDefinition> contentDefinition();

  Optional<Reference> author();

  Optional<code> language();

  Optional<dateTime> issued();

  Optional<uri> instantiatesUri();

  Optional<CodeableConcept> contentDerivative();

  Optional<List<Reference>> subject();

  Optional<List<String>> alias();

  Optional<uri> url();

  Optional<code> status();

  static ImmutableContract.ResourceTypeBuildStage builder() {
    return ImmutableContract.builder();
  }
}
