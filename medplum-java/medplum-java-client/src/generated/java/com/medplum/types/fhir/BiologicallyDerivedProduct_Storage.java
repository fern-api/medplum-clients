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
  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<Biologicallyderivedproduct_storageScale> scale();

  Optional<String> id();

  Optional<Decimal> temperature();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> duration();

  static ImmutableBiologicallyDerivedProduct_Storage.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Storage.builder();
  }
}
