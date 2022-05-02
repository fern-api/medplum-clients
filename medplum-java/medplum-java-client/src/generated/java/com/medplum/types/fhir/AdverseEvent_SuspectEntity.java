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
    as = ImmutableAdverseEvent_SuspectEntity.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AdverseEvent_SuspectEntity {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<AdverseEvent_Causality>> causality();

  Optional<List<Extension>> modifierExtension();

  Reference instance();

  static ImmutableAdverseEvent_SuspectEntity.InstanceBuildStage builder() {
    return ImmutableAdverseEvent_SuspectEntity.builder();
  }
}
