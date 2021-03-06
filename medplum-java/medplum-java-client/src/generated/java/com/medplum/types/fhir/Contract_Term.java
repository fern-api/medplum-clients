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
  Optional<Period> applies();

  Optional<List<Contract_SecurityLabel>> securityLabel();

  Optional<DateTime> issued();

  Optional<List<Contract_Term>> group();

  Optional<String> id();

  Optional<String> text();

  Optional<List<Contract_Action>> action();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Reference> topicReference();

  Contract_Offer offer();

  Optional<CodeableConcept> subType();

  Optional<List<Contract_Asset>> asset();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<Identifier> identifier();

  static ImmutableContract_Term.OfferBuildStage builder() {
    return ImmutableContract_Term.builder();
  }
}
