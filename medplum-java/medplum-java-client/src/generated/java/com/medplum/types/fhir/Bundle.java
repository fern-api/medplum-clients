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
    as = ImmutableBundle.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle {
  String resourceType();

  Optional<Meta> meta();

  Optional<List<Bundle_Entry>> entry();

  Optional<Identifier> identifier();

  Optional<Id> id();

  Optional<Instant> timestamp();

  Optional<Uri> implicitRules();

  Optional<List<Bundle_Link>> link();

  Optional<Signature> signature();

  Optional<UnsignedInt> total();

  Optional<BundleType> type();

  Optional<Code> language();

  static ImmutableBundle.ResourceTypeBuildStage builder() {
    return ImmutableBundle.builder();
  }
}
