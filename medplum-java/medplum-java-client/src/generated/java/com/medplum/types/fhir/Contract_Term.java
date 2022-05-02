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
  Optional<String> id();

  Optional<DateTime> issued();

  Optional<CodeableConcept> topicCodeableConcept();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<String> text();

  Optional<List<Contract_Asset>> asset();

  Optional<List<Contract_Action>> action();

  Optional<List<Contract_SecurityLabel>> securityLabel();

  Optional<Identifier> identifier();

  Contract_Offer offer();

  Optional<CodeableConcept> subType();

  Optional<Reference> topicReference();

  Optional<Period> applies();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Contract_Term>> group();

  static ImmutableContract_Term.OfferBuildStage builder() {
    return ImmutableContract_Term.builder();
  }
}
