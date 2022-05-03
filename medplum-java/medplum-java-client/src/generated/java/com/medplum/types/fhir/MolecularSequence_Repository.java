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
  Optional<String> variantsetId();

  Optional<String> id();

  Optional<String> name();

  Optional<String> readsetId();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Molecularsequence_repositoryType> type();

  Optional<Uri> url();

  Optional<String> datasetId();

  static ImmutableMolecularSequence_Repository.Builder builder() {
    return ImmutableMolecularSequence_Repository.builder();
  }
}
