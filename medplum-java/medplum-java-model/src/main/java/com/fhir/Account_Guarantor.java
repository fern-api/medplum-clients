package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Reference party();

  Optional<Boolean> onHold();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  static ImmutableAccount_Guarantor.PartyBuildStage builder() {
    return ImmutableAccount_Guarantor.builder();
  }
}
