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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Period> duration();

  Optional<Decimal> temperature();

  Optional<Biologicallyderivedproduct_storageScale> scale();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  static ImmutableBiologicallyDerivedProduct_Storage.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Storage.builder();
  }
}
