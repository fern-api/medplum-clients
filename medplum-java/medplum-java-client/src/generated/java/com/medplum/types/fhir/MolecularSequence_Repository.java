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
    as = ImmutableMolecularSequence_Repository.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Repository {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Molecularsequence_repositoryType> type();

  Optional<Uri> url();

  Optional<String> readsetId();

  Optional<String> datasetId();

  Optional<String> name();

  Optional<String> variantsetId();

  static ImmutableMolecularSequence_Repository.Builder builder() {
    return ImmutableMolecularSequence_Repository.builder();
  }
}
