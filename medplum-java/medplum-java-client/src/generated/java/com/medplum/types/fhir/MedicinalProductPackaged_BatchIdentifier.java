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
    as = ImmutableMedicinalProductPackaged_BatchIdentifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPackaged_BatchIdentifier {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Identifier outerPackaging();

  Optional<Identifier> immediatePackaging();

  Optional<String> id();

  static ImmutableMedicinalProductPackaged_BatchIdentifier.OuterPackagingBuildStage builder() {
    return ImmutableMedicinalProductPackaged_BatchIdentifier.builder();
  }
}
