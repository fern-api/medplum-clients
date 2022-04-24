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
    as = ImmutableMedicinalProductPackaged_BatchIdentifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPackaged_BatchIdentifier {
  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> immediatePackaging();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Identifier outerPackaging();

  static ImmutableMedicinalProductPackaged_BatchIdentifier.OuterPackagingBuildStage builder() {
    return ImmutableMedicinalProductPackaged_BatchIdentifier.builder();
  }
}
