package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableAccount_Guarantor.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Account_Guarantor {
  Optional<String> id();

  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Reference party();

  Optional<Boolean> onHold();

  static ImmutableAccount_Guarantor.PartyBuildStage builder() {
    return ImmutableAccount_Guarantor.builder();
  }
}
