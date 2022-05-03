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
  Optional<String> condition();

  Optional<List<Contract_Answer>> answer();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<List<Period>> period();

  Optional<List<Contract_ValuedItem>> valuedItem();

  Optional<CodeableConcept> scope();

  Optional<List<Contract_Context>> context();

  Optional<List<Reference>> typeReference();

  Optional<String> text();

  Optional<List<CodeableConcept>> periodType();

  Optional<String> id();

  Optional<Coding> relationship();

  Optional<List<CodeableConcept>> subtype();

  Optional<List<CodeableConcept>> type();

  Optional<List<String>> linkId();

  Optional<List<Extension>> extension();

  Optional<List<Period>> usePeriod();

  Optional<List<Extension>> modifierExtension();

  static ImmutableContract_Asset.Builder builder() {
    return ImmutableContract_Asset.builder();
  }
}
