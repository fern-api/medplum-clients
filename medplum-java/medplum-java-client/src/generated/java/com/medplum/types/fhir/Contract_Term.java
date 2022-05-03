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
    as = ImmutableContract_Term.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Term {
  Optional<List<Extension>> extension();

  Optional<DateTime> issued();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> topicReference();

  Optional<Identifier> identifier();

  Optional<String> text();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<List<Contract_Action>> action();

  Optional<Period> applies();

  Optional<List<Contract_Term>> group();

  Contract_Offer offer();

  Optional<CodeableConcept> subType();

  Optional<List<Contract_SecurityLabel>> securityLabel();

  Optional<List<Contract_Asset>> asset();

  static ImmutableContract_Term.OfferBuildStage builder() {
    return ImmutableContract_Term.builder();
  }
}
