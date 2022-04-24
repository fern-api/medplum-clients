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
    as = ImmutableMolecularSequence_Repository.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Repository {
  Optional<String> id();

  Optional<String> name();

  Optional<Molecularsequence_repositoryType> type();

  Optional<String> variantsetId();

  Optional<List<Extension>> modifierExtension();

  Optional<String> datasetId();

  Optional<String> readsetId();

  Optional<List<Extension>> extension();

  Optional<uri> url();

  static ImmutableMolecularSequence_Repository.Builder builder() {
    return ImmutableMolecularSequence_Repository.builder();
  }
}
