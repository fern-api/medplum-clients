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
    as = ImmutableBiologicallyDerivedProduct_Storage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface BiologicallyDerivedProduct_Storage {
  Optional<decimal> temperature();

  Optional<Biologicallyderivedproduct_storageScale> scale();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Period> duration();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableBiologicallyDerivedProduct_Storage.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Storage.builder();
  }
}
