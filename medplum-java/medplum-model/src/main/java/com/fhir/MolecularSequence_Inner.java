package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> start();

  Optional<Integer> end();

  Optional<List<Extension>> extension();

  static ImmutableMolecularSequence_Inner.Builder builder() {
    return ImmutableMolecularSequence_Inner.builder();
  }
}
