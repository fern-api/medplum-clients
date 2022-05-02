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
    as = ImmutableBiologicallyDerivedProduct_Storage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface BiologicallyDerivedProduct_Storage {
  Optional<Decimal> temperature();

  Optional<Period> duration();

  Optional<List<Extension>> extension();

  Optional<Biologicallyderivedproduct_storageScale> scale();

  Optional<String> description();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableBiologicallyDerivedProduct_Storage.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Storage.builder();
  }
}
