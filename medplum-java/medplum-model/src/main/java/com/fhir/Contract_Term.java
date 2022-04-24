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
    as = ImmutableContract_Term.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Term {
  Optional<dateTime> issued();

  Contract_Offer offer();

  Optional<CodeableConcept> subType();

  Optional<CodeableConcept> type();

  Optional<List<Contract_Term>> group();

  Optional<String> id();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<Reference> topicReference();

  Optional<Period> applies();

  Optional<List<Contract_Action>> action();

  Optional<String> text();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<List<Contract_SecurityLabel>> securityLabel();

  Optional<List<Contract_Asset>> asset();

  static ImmutableContract_Term.OfferBuildStage builder() {
    return ImmutableContract_Term.builder();
  }
}
