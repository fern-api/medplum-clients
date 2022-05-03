package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMolecularSequence_Inner.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Inner {
  Optional<Integer> end();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> start();

  Optional<String> id();

  static ImmutableMolecularSequence_Inner.Builder builder() {
    return ImmutableMolecularSequence_Inner.builder();
  }
}
