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
    as = ImmutableComposition_RelatesTo.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition_RelatesTo {
  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> targetIdentifier();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<code> code();

  Optional<Reference> targetReference();

  static ImmutableComposition_RelatesTo.Builder builder() {
    return ImmutableComposition_RelatesTo.builder();
  }
}
