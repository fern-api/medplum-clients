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
  Optional<Coding> relationship();

  Optional<String> text();

  Optional<List<Contract_Context>> context();

  Optional<String> condition();

  Optional<List<Extension>> extension();

  Optional<List<Contract_Answer>> answer();

  Optional<List<String>> linkId();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> type();

  Optional<List<Period>> usePeriod();

  Optional<String> id();

  Optional<List<Period>> period();

  Optional<CodeableConcept> scope();

  Optional<List<Contract_ValuedItem>> valuedItem();

  Optional<List<CodeableConcept>> subtype();

  Optional<List<Reference>> typeReference();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<List<CodeableConcept>> periodType();

  static ImmutableContract_Asset.Builder builder() {
    return ImmutableContract_Asset.builder();
  }
}
