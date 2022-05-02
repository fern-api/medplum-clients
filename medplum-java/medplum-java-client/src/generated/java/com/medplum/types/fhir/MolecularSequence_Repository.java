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
  Optional<Molecularsequence_repositoryType> type();

  Optional<String> readsetId();

  Optional<Uri> url();

  Optional<String> variantsetId();

  Optional<String> name();

  Optional<String> datasetId();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableMolecularSequence_Repository.Builder builder() {
    return ImmutableMolecularSequence_Repository.builder();
  }
}
