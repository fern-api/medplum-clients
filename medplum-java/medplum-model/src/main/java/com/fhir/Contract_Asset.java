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
    as = ImmutableContract_Asset.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Asset {
  Optional<List<Period>> period();

  Optional<List<Period>> usePeriod();

  Optional<List<CodeableConcept>> type();

  Optional<List<Reference>> typeReference();

  Optional<List<CodeableConcept>> subtype();

  Optional<List<String>> linkId();

  Optional<List<CodeableConcept>> periodType();

  Optional<List<Contract_Context>> context();

  Optional<CodeableConcept> scope();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Contract_ValuedItem>> valuedItem();

  Optional<List<Extension>> extension();

  Optional<String> text();

  Optional<Coding> relationship();

  Optional<List<Contract_Answer>> answer();

  Optional<String> id();

  Optional<String> condition();

  Optional<List<unsignedInt>> securityLabelNumber();

  static ImmutableContract_Asset.Builder builder() {
    return ImmutableContract_Asset.builder();
  }
}
