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
    as = ImmutableContract_Offer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Offer {
  Optional<List<CodeableConcept>> decisionMode();

  Optional<List<Identifier>> identifier();

  Optional<List<String>> linkId();

  Optional<Reference> topic();

  Optional<String> text();

  Optional<List<Contract_Party>> party();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> decision();

  Optional<String> id();

  Optional<List<Contract_Answer>> answer();

  Optional<List<unsignedInt>> securityLabelNumber();

  Optional<List<Extension>> extension();

  static ImmutableContract_Offer.Builder builder() {
    return ImmutableContract_Offer.builder();
  }
}
