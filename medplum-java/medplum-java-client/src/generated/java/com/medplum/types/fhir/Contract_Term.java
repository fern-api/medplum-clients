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
  Optional<List<Extension>> modifierExtension();

  Optional<List<Contract_Action>> action();

  Optional<CodeableConcept> subType();

  Optional<Reference> topicReference();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Contract_Offer offer();

  Optional<String> id();

  Optional<Period> applies();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<List<Contract_SecurityLabel>> securityLabel();

  Optional<String> text();

  Optional<DateTime> issued();

  Optional<List<Contract_Asset>> asset();

  Optional<Identifier> identifier();

  Optional<List<Contract_Term>> group();

  static ImmutableContract_Term.OfferBuildStage builder() {
    return ImmutableContract_Term.builder();
  }
}
