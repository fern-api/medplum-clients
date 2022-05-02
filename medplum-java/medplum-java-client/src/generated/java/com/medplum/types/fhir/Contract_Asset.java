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
    as = ImmutableContract_Asset.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Asset {
  Optional<String> id();

  Optional<Coding> relationship();

  Optional<List<String>> linkId();

  Optional<List<Contract_Answer>> answer();

  Optional<List<Period>> usePeriod();

  Optional<List<Period>> period();

  Optional<List<Contract_Context>> context();

  Optional<String> condition();

  Optional<List<CodeableConcept>> subtype();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<String> text();

  Optional<List<CodeableConcept>> periodType();

  Optional<CodeableConcept> scope();

  Optional<List<Reference>> typeReference();

  Optional<List<CodeableConcept>> type();

  Optional<List<Contract_ValuedItem>> valuedItem();

  Optional<List<Extension>> extension();

  static ImmutableContract_Asset.Builder builder() {
    return ImmutableContract_Asset.builder();
  }
}
